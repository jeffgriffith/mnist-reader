import static java.lang.Math.min;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import mnist.MnistReader;

public class TestMnistReader {

	@Test
	public void test() {
		String LABEL_FILE = "/Users/jgriffith/mnist-data/t10k-labels-idx1-ubyte";
		String IMAGE_FILE = "/Users/jgriffith/mnist-data/t10k-images-idx3-ubyte";

		int[] labels = MnistReader.getLabels(LABEL_FILE);
		List<int[][]> images = MnistReader.getImages(IMAGE_FILE);
		
		assertEquals(labels.length, images.size());
		assertEquals(28, images.get(0).length);
		assertEquals(28, images.get(0)[0].length);

		for (int i = 0; i < min(10, labels.length); i++) {
			printf("================= LABEL %d\n", labels[i]);
			printf("%s", MnistReader.renderImage(images.get(i)));
		}
	}

	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}


}
