package DemoGameManagement.Entity;

import java.time.LocalDate;

public class User {
        private int id;
        private String firstName;
        private String lastName;
        private String nationalityId;
        private LocalDate dateBirth;

        public User(int id, String firstName, String lastName, String nationalityId, LocalDate dateBirth) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.nationalityId = nationalityId;
            this.dateBirth = dateBirth;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getnationalityId() {
            return nationalityId;
        }

        public void setnationalityId(String nationalityId) {
            this.nationalityId = nationalityId;
        }

        public LocalDate getDate() {
            return dateBirth;
        }

        public void setDate(LocalDate dateBirth) {
            this.dateBirth = dateBirth;
        }
    }