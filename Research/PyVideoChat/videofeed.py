import cv2
from cv2.cv import *
import Image
import numpy as np

class VideoFeed:

    def __init__(self,mode=1,name="w1",capture=1):
        print name
        if mode == 1:
            cv2.startWindowThread()
            cv2.namedWindow(name,CV_WINDOW_AUTOSIZE)
        self.camera_index = 0
        self.name = name
        if capture == 1:
            self.capture = cv2.VideoCapture(self.camera_index)

    def get_frame(self):
        self.frame = self.capture.read()
        self.c = cv2.waitKey(1)
        if(self.c=="n"): #in "n" key is pressed while the popup window is in focus
            self.camera_index += 1 #try the next camera index
            self.capture = cv2.VideoCapture(camera_index)
            if not self.capture: #if the next camera index didn't work, reset to 0.
                self.camera_index = 0
                self.capture = cv2.VideoCapture(camera_index)
        #jpegImg= Image.fromstring("RGB",cv2.getSize(self.frame),self.frame.tostring())
        #retStr=jpegImg.tostring("jpeg","RGB")
        np_arr = np.fromstring(self.frame, np.uint8)
        image_np = cv2.imdecode(np_arr, cv2.CV_LOAD_IMAGE_COLOR)
        print "Compressed Size = ",len(image_np)
        return image_np


    def set_frame(self,frame):
        #This function sets the picture to a desired frame size
        #self  - object of this class
        #frame - captured frame
        jpegPIL = Image.fromstring("RGB",(640,480),frame,"jpeg","RGB","raw")
        cv_im = cv2.createImage((640,480),cv.IPL_DEPTH_8U,3)
        cv2.setData(cv_im,jpegPIL.tostring())
        cv2.showImage(self.name,cv_im)
        
if __name__ == "__main__":
    vf = VideoFeed(1,"test",1) #initial mode,window name,capture
    while 1: #an infinite loop
        m = vf.get_frame() #Getting new frames incrementally
        vf.set_frame(m)   #putting the modified image frame into viewport
        
