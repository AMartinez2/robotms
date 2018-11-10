package ms.robot.robotms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ms.robot.robotms.entity.Robot;

public interface RobotRepository extends MongoRepository<Robot, String> {
    @Query (value = "{'name':?0}")   
    Robot findByName(String id);
}