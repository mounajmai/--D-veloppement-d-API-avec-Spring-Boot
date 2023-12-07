package com.gestion.immobiliere.demo.entity;

public class RentalContract {

        private long id;
        private Property property;
        private Owner owner;
        private String tenant;
        private double monthlyRent;

        public RentalContract() {
                // Constructeur par défaut
                this.id = 0; // ou une valeur par défaut appropriée
                this.property = new Property();
                this.owner = new Owner();
                this.tenant = "";
                this.monthlyRent = 0.0; // ou une valeur par défaut appropriée
        }

        public RentalContract(long id, Property property, Owner owner, String tenant, double monthlyRent) {
                this.id = id;
                this.property = property;
                this.owner = owner;
                this.tenant = tenant;
                this.monthlyRent = monthlyRent;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public Property getProperty() {
                return property;
        }

        public void setProperty(Property property) {
                this.property = property;
        }

        public Owner getOwner() {
                return owner;
        }

        public void setOwner(Owner owner) {
                this.owner = owner;
        }

        public String getTenant() {
                return tenant;
        }

        public void setTenant(String tenant) {
                this.tenant = tenant;
        }

        public double getMonthlyRent() {
                return monthlyRent;
        }

        public void setMonthlyRent(double monthlyRent) {
                this.monthlyRent = monthlyRent;
        }
}
