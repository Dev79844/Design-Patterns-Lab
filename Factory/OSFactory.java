public class OSFactory {
    
    public OS getOs(String os){
        if(os == null){
            return null;
        }

        if(os.equalsIgnoreCase("Android")){
            return new Android();
        }

        if(os.equalsIgnoreCase("IOS")){
            return new IOS();
        }

        if(os.equalsIgnoreCase("Windows")){
            return new Windows();
        }
        return null;
    }
}
