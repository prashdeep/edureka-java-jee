package co.edureka.javajee.module1;


public class Padietrician extends Doctor {

    @Override
    public void treatPatient(){
        treatKids();
    }

    public void treatKids(){
        System.out.println("Treating Kids....");
    }


}