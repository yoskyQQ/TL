package tl.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity @Table(name = "course_records") 
@Component 
public class CourseRecords {

	@Id @Column(name = "COURSE_RECORD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseRecordId;
	
	@Column(name = "STUDENT_ID")
	private int studentId;

	@Column(name = "COURSE_ID")
	private int courseId;

	@Column(name = "SUBJECT_ID")
	private int subjectId;
	
	@Column(name = "COURSE_DATE")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8") //控制送出參數的格式
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm") //控制接收參數的格式
	private Date courseDate;
	
	@Column(name = "TUTOR_NAME")
	private String tutorName;
	
	@Transient
	private String stringDate; 

	@Transient
	private String stringTime; 
	
	@Column(name = "REQUIRED_POINTS")
	private Integer requiredPoints;
	
	
	@OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "courseId", referencedColumnName = "courseId")
	private Courses courses;
	//在CourseRecords裡面join Courses的CourseId

	public int getCourseRecordId() {
		return courseRecordId;
	}

	public void setCourseRecordId(int courseRecordId) {
		this.courseRecordId = courseRecordId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}	

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public Date getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(Date date) {
		this.courseDate = date;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public Integer getRequiredPoints() {
		return requiredPoints;
	}

	public void setRequiredPoints(Integer requiredPoints) {
		this.requiredPoints = requiredPoints;
	}
	

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getStringDate() {
		return stringDate;
	}

	public void setStringDate(String stringDate) {
		this.stringDate = stringDate;
	}

	public String getStringTime() {
		return stringTime;
	}

	public void setStringTime(String stringTime) {
		this.stringTime = stringTime;
	}

	public Object toJson(List<CourseRecords> courRecoDataList) {
		return null;
	}

	
}
