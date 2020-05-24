import lsp.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //testCourt();
        testGrassCourt();
    }

//   public static void  testCourt(){

//       List<Court> courts = new ArrayList<Court>();
//       courts.add(new WimbledonCourt());
//       courts.add(new AustralianOpenCourt());
//       courts.add(new RolandGarrosCourt());

//       for (Court court: courts){
//           court.cutGrass();
//       }
//   }


    public static void testGrassCourt(){

        List<GrassCourt> courts = new ArrayList<GrassCourt>();
        courts.add(new WimbledonCourt());
        courts.add(new MallorcaOpen());

        for (GrassCourt court: courts){
            court.cutGrass();
        }

    }

}
