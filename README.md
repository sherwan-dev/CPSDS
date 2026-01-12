# CPSDS
Car parking space detection based on image processing 
#Set up development environment:

1- Download and install the Netbeans IDE and JDK.
2- Download JavaCV files from https://drive.google.com/drive/folders/1rgDJTRjJCMJgZN43H631mr5z35eBZOX4
3- Import JavaCV files to the Project: open the project on Netbeans, right click on Libraries > Add Library > Create one > give it a name > click ok > Add all downloaded JAR files to the Librar > OK > select the created library > click Add Library.
4- Download latest version of OpenCV: https://opencv.org/releases, and extract the folder to disk c.
5- On Netbeans, open the project and right click on Libraries > Add Library > Create one > give it a name > click ok > add this file from the extracted opencv folder: path/to/opencv/build/java/opencv-abcd.jar, where abcd is the version of your downloaded opencv.
6- Tell Netbeans, where your opencv is located: right click on the Projekt > Properties > Run > VM Options > add this line: -Djava.library.path=C:\opencv\build\x64\vc16\bin, replace vc16 with the version you have.
7- Happy coding!. 
