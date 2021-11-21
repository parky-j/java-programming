class ImageViewer{
	private static final int MAX_PLUGINS = 5;
	ImageViewerInterface[] module;
	int numberOfModules = 0;

	public ImageViewer(){
		module = new ImageViewerInterface[MAX_PLUGINS];
	}
	
	void addPlugIn(ImageViewerInterface ivi){
		if(numberOfModules < module.length)
			module[numberOfModules++] = ivi;
	}
	
	void show(String fileName, String ext){
		boolean checker = false;
		for(int i = 0; i < module.length; i++){
			if(module[i] == null)
				break;
			if(ext.equals(module[i].getExtension())){
				System.out.println("Using " + module[i].getName());
				module[i].show(fileName);
				checker = true;
				break;
			}
		}
		if(checker == false)
			System.out.println("Image viewer plugin for the extension, " + ext + ", is not registered");
	}
}