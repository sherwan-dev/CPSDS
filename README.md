# CPSDS

**Car Parking Space Detection System** based on image processing.

---

## Setup Development Environment

### 1. Install tools

Download and install:

- Apache NetBeans IDE  
- Java Development Kit (JDK)

---

### 2. Download JavaCV files

Download all JavaCV files from:

https://drive.google.com/drive/folders/1rgDJTRjJCMJgZN43H631mr5z35eBZOX4

---

### 3. Import JavaCV libraries into NetBeans

1. Open the project in NetBeans  
2. Right-click on **Libraries** > **Add Library** > **Create**  
3. Give the library a name and click **OK**  
4. Click **Add JAR/Folder** and select all downloaded JavaCV JAR files  
5. Click **OK**  
6. Select the created library and click **Add Library**

---

### 4. Download and extract OpenCV

Download the latest version of OpenCV:

https://opencv.org/releases

Extract the downloaded folder to: C:\opencv

---

### 5. Add OpenCV Java library

1. In NetBeans, right-click on **Libraries** > **Add Library** > **Create**  
2. Give the library a name and click **OK**  
3. Add this file from the extracted OpenCV folder:C:\opencv\build\java\opencv-XXXX.jar

Replace `XXXX` with your OpenCV version number.

---

### 6. Set OpenCV native library path

1. Right-click the project > **Properties** > **Run**  
2. In **VM Options**, add:
-Djava.library.path=C:\opencv\build\x64\vc16\bin

Replace `vc16` with your OpenCV compiler version if different.

---

### 7. Done

Build and run the project.

Happy coding! 



