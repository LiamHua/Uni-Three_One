package per.liam.stumanager.dao;

import javafx.collections.ObservableList;
import org.springframework.jdbc.core.JdbcTemplate;
import per.liam.stumanager.model.MainFrameInit;
import per.liam.stumanager.utils.Course;
import per.liam.stumanager.utils.Score;
import per.liam.stumanager.utils.JdbcUtil;
import per.liam.stumanager.utils.Student;

import java.util.ArrayList;

/**
 * @author liam
 * @date 19-12-19 下午12:40
 */
public class UpdateDaoImpl implements UpdateDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());
    @Override
    public ArrayList<Student> insertStu(ObservableList<Student> list) {
        ArrayList<Student> failed = new ArrayList<>();
        String sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
        for (Student stu : list){
            int update = jdbcTemplate.update(sql, stu.getSno(), stu.getName(), stu.getSex(), stu.getTel(), stu.getBirthday(),
                    stu.getAddress(), MainFrameInit.instituteR.get(stu.getInstitute()), MainFrameInit.majorR.get(stu.getMajor()), stu.getStartYear());
            if (update != 1){
                failed.add(stu);
            }
        }
        return failed;
    }

    @Override
    public int delete(Student stu) {
        String sql = "delede from student where Sno=?";
        return jdbcTemplate.update(sql, stu.getSno());
    }

    @Override
    public int changeStu(Student stu) {
        String sql = "update student set name=?,sex=?,tel=?,birthday=?,address=?,instituteId=?,majorId=?,start_year=? where Sno=?";
        return jdbcTemplate.update(sql,stu.getName(),stu.getSex(), stu.getTel(), stu.getBirthday(),
                stu.getAddress(), stu.getInstitute(), stu.getMajor(), stu.getStartYear(), stu.getSno());
    }

    @Override
    public int changeScore(Score score) {
        String sql = "update score set firstScore=?,secondScore=? where Sno=? and Cno=?";
        return jdbcTemplate.update(sql, score.getFirstScore(), score.getSecondScore(), score.getSno(),
                score.getCno());
    }

    @Override
    public int changeCourse(Course course) {
        String sql = "update course set Cname=?,teacher=?,tel=? where Cno=?";
        return jdbcTemplate.update(sql, course.getName(), course.getTeacher(), course.getTel(), course.getCno());
    }

    @Override
    public ArrayList<Course> insertCourse(ObservableList<Course> list) {
        ArrayList<Course> failed = new ArrayList<>();
        String sql = "insert into course values(?,?,?,?,?)";
        for (Course course : list){
            int update = jdbcTemplate.update(sql,course.getCno(), course.getName(),
                    MainFrameInit.instituteR.get(course.getInstitute()), course.getTeacher(), course.getTel());
            if (update != 1){
                failed.add(course);
            }
        }
        return failed;
    }
}
