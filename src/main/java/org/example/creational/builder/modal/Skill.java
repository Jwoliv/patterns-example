package org.example.creational.builder.modal;

public class Skill {
    private Long id;
    private String title;

    public Skill(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public static SkillBuilder builder() {
        return new SkillBuilder();
    }

    public static class SkillBuilder {
        private Long id;
        private String title;

        public Skill build() {
            return new Skill(id, title);
        }

        public SkillBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SkillBuilder title(String title) {
            this.title = title;
            return this;
        }
    }
}
