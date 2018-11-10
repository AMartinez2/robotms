package ms.robot.robotms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ms.robot.robotms.entity.Robot;
import ms.robot.robotms.repository.RobotRepository;

@RestController
public class RobotController {
    @Autowired
    RobotRepository robotRepository;

    @CrossOrigin()
    @GetMapping ("/allRobots")
    public List<Robot> getAll () {
        return robotRepository.findAll();
    }

    @GetMapping("/name/{name}")
    public Robot getRobotByName (@PathVariable String name) {
        Robot result = robotRepository.findByName(name);
        return result;
    }
}