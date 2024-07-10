import aws.vpc.BasicInfraAdminister;
import aws.vpc.rds.RdsAdminister;
import aws.vpc.subnet.dto.BasicInfraDto;
import software.amazon.awscdk.App;

public class AutoCodeApplication {

    public static void main(final String[] args) {
        App app = new App();

        BasicInfraAdminister infraAdminister = new BasicInfraAdminister();
        BasicInfraDto infraDto = infraAdminister.createInfra(app, "730335599027", "us-east-2");

//        EksAdminister eksAdminister = new EksAdminister();
//        eksAdminister.createInfra(app, "730335599027", "us-east-2", subnetDtos);

        RdsAdminister rdsAdminister = new RdsAdminister();
        rdsAdminister.createInfra(app, "730335599027", "us-east-2", infraDto);

        System.out.println("complete");

        app.synth();
    }

    // action
}
