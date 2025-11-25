package Exception.compileTimeCheckedException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("1+2: "+ (1+2));
        try{
            method1();
        System.out.println("3+5: "+ (3+5));
        }
        catch (RoshanException e){
            e.getMessage();
        }
        catch(Exception e){
            throw e;
//            System.out.println(e.getMessage());
        }
//        catch (ClassNotFoundException | InterruptedException | FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
        finally {
            System.out.println("3+5: "+ (3+5));
        }

    }

    public static void method1() throws ClassNotFoundException, InterruptedException, RoshanException, FileNotFoundException{
        if("RoshanException".equals("RoshanException")){
            throw new RoshanException("Roshan Exception occured");
        }
        else if("Roshan".equals("Roshan2")){
            throw new ClassNotFoundException();
        }else{
            throw new InterruptedException();
        }


    }
}
