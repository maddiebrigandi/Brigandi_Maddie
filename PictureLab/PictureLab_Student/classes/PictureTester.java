/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
 /** Method to test zeroBlue */
 public static void testZeroBlue()
 {
 Picture beach = new Picture("beach.jpg");
 beach.explore();
 beach.zeroBlue();
 beach.explore();
 }
 public static void testKeepOnlyBlue() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.keepOnlyBlue();
	beach.explore();
 }
 public static void testNegate() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.negate();
	beach.explore();
 }
 public static void testGrayScale() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.grayScale();
	beach.explore();
 }
 
 /** Method to test mirrorVertical */
 public static void testMirrorVertical()
 {
 Picture caterpillar = new Picture("caterpillar.jpg");
 caterpillar.explore();
 caterpillar.mirrorVertical();
 caterpillar.explore();
 }
 public static void testMirrorVerticalRightToLeft() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVerticalRightToLeft();
	caterpillar.explore();
 }
 public static void testMirrorHorizontal() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
 }
 public static void testMirrorHorizontalBotToTop() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontalBotToTop();
	caterpillar.explore();
 }
 
 /** Method to test mirrorTemple */
 public static void testMirrorTemple()
 {
 Picture temple = new Picture("temple.jpg");
 temple.explore();
 temple.mirrorTemple();
 temple.explore();
 }
 public static void testMirrorArms() {
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
 }
 public static void testMirrorGull() {
	Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
	seagull.mirrorGull();
	seagull.explore();
 }
 /** Method to test the collage method */
 public static void testCollage()
 {
 Picture canvas = new Picture("640x480.jpg");
 canvas.createCollage();
 canvas.explore();
 }
 
 /** Method to test edgeDetection */
 public static void testEdgeDetection()
 {
 Picture swan = new Picture("swan.jpg");
 swan.edgeDetection(10);
 swan.explore();
 }
 public static void testNewCopy() {
	Picture flower = new Picture("flower1.jpg");
	flower.explore();
	flower.copyNew(flower, 0, 23, 0, 38);
	flower.explore();
 }
 public static void testEdgeDetection2()
 {
 Picture swan = new Picture("swan.jpg");
	swan.explore();
 swan.edgeDetection2(10);
 swan.explore();
 }
 public static void testMyCollage() {
	Picture barbaraS = new Picture("barbaraS.jpg");
	barbaraS.explore();
	barbaraS.myCollage();
	barbaraS.explore();
 }
 
 /** Main method for testing. Every class can have a main
 * method in Java */
 public static void main(String[] args)
 {
 // uncomment a call here to run a test
 // and comment out the ones you don't want
 // to run
 //testZeroBlue();
 //testKeepOnlyBlue();
 //testKeepOnlyRed();
 //testKeepOnlyGreen();
 //testNegate();
 //testGrayscale();
 //testFixUnderwater();
 //testMirrorVertical();
 testMirrorTemple();
 //testMirrorArms();
 //testMirrorGull();
 //testMirrorDiagonal();
 //testCollage();
 //testCopy();
 //testEdgeDetection();
 //testEdgeDetection2();
 //testChromakey();
 //testEncodeAndDecode();
 //testGetCountRedOverValue(250);
 //testSetRedToHalfValueInTopHalf();
 //testClearBlueOverValue(200);
 //testGetAverageForColumn(0);
	testKeepOnlyBlue();
	testNegate();
	testGrayScale();
	testMirrorVerticalRightToLeft();
	testMirrorHorizontal();
	testMirrorHorizontalBotToTop();
	testMirrorArms();
	testMirrorGull();
	testNewCopy();
	testMyCollage();
	testEdgeDetection();
	testEdgeDetection2();
 }
}