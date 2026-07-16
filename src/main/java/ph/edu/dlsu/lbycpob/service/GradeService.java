package ph.edu.dlsu.lbycpob.service;

import org.springframework.stereotype.Service;
import ph.edu.dlsu.lbycpob.dto.StudentFormDTO;
import ph.edu.dlsu.lbycpob.model.Student;
import ph.edu.dlsu.lbycpob.util.GradeCalculator;
import ph.edu.dlsu.lbycpob.util.IDVerifier;

@Service
public class GradeService {

    public Student buildStudent(StudentFormDTO dto){

        // Replaces inputLabPerformance(). This computes the average of five modules
        double[] moduleScores = {
                dto.getModule1(), dto.getModule2(), dto.getModule3(),
                dto.getModule4(), dto.getModule5()
        };
        double labPerformance = GradeCalculator.computeAverage(moduleScores);

    }
}
