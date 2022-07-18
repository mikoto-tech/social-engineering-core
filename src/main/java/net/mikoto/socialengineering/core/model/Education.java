package net.mikoto.socialengineering.core.model;

import java.util.Objects;

/**
 * @author mikoto
 * Create for core
 * Create at 2022/7/17
 */
public class Education {
    private String schoolName = null;
    private EducationType educationType = null;

    public Education(EducationType educationType) {
        this.educationType = educationType;
    }

    public Education(String schoolName, EducationType educationType) {
        this.schoolName = schoolName;
        this.educationType = educationType;
    }

    public Education() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return Objects.equals(schoolName, education.schoolName) && educationType == education.educationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, educationType);
    }

    @Override
    public String toString() {
        return "Education{" +
                "schoolName='" + schoolName + '\'' +
                ", educationType=" + educationType +
                '}';
    }
}
