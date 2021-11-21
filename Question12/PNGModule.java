public class PNGModule implements ImageViewerInterface{
	@Override
	public String getName(){
		return "PNG Module";
	}
	@Override
	public void show(String fileName){
		System.out.println("PNG image loading: " + fileName);
	}
	@Override
	public String getExtension(){
		return "PNG";
	}
}