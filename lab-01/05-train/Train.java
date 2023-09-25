class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(
            int nFirstClassSeats,
            int nSecondClassSeats) {
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nTotSeats = this.nFirstClassSeats + this.nSecondClassSeats;

        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }

    void reserveFirstClassSeats(int seats) {
        this.nFirstClassReservedSeats += seats;
    }

    void reserveSecondClassSeats(int seats) {
        this.nSecondClassReservedSeats += seats;
    }

    double getTotOccupancyRatio() {
        return (double) (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nTotSeats;
    }

    double getFirstClassOccupancyRatio() {
        return (double) this.nFirstClassReservedSeats / this.nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio() {
        return (double) this.nSecondClassReservedSeats / this.nSecondClassSeats;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}
