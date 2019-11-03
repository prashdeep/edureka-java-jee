package co.edureka.javajee.module1;

public class OrthoPedician extends Doctor {

    @Override
    public void treatPatient(){
        conductXRay();
        conductCTScan();
    }

    public void conductXRay(){
        System.out.println("Conducting XRay");
    }

    public void conductCTScan(){
        System.out.println("Conducting CTScan");
    }
}