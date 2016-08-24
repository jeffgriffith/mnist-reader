# mnist-reader
A Java file reader for Yann Lecun's cleaned up version of the MNIST handwritten digits database. The input data can be found on his site at:
http://yann.lecun.com/exdb/mnist/

```java
int[] labels = MnistReader.readLabels("Path to unzipped minst label file");
int[][] images = MnistReader.readImages("Path to unzipped mnist images file");
```

The images are row/column pixel values from 0 to 255 to indicate the pixel intensity.
