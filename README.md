# mnist-reader
A Java file reader for Yann Lecun's cleaned up version of the MNIST handwritten digits database. The input data can be found on his site at:
http://yann.lecun.com/exdb/mnist/

```java
int[] labels = MnistReader.getLabels("Path to unzipped minst label file");
List<int[][]> images = MnistReader.getImages("Path to unzipped mnist images file");
```

Labels are integers 0 to 9 and the images are row/column pixel values from 0 to 255 to indicate the pixel intensity. These are parallel arrays where label[i] indicates the label for images[i].
