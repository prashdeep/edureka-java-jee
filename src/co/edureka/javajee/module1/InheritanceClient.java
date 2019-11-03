package co.edureka.javajee.module1;


public class InheritanceClient {

    public static void main(String[] args) {
       // LHS Data type variable name = RHS new Data type();
       // Doctor doctor = new Doctor();
        Doctor doc  = new Padietrician();
        OrthoPedician orthoPedician = new OrthoPedician();
        // compilation error - Dentist dentist = new Doctor();

        Doctor doctor1 = orthoPedician;
        Doctor doctor2 = doc;

        OrthoPedician orthoPedician1 = orthoPedician;

     //   new Padietrician().treatKids();

        /*if (ortho instanceof OrthoPedician) {
            OrthoPedician orthoPedician2 = (OrthoPedician) ortho;
            orthoPedician2.treatPatient();
        }*/

       /* orthoPedician.conductCTScan();
        orthoPedician.conductXRay();
        orthoPedician.treatPatient();
       // ortho.conductCTScan();
        */

      // doctor.treatPatient();
        //doc.treatPatient();

        Doctor dentist = new Padietrician();

        dentist.treatPatient();



    }
}