public class ConcertTickets {


        //instance vars
        private String ArtistName;
        private int totalPremiumSeats;
        private int bookedPremiumSeats;
        private int totalGeneralAdmissionSeats;
        private int bookedGeneralAdmissionSeats;



        //getters...provide access to private variables and gets values values. No args, return iv

        public String getArtistName() {return AristName;}
        public int getTotalPremiumSeats() {
            return totalPremiumSeats;
        }
        public int getBookedPremiumSeats() {
            return bookedPremiumSeats;
        }
        public int getAvailablePremiumSeats(){
            return this.totalPremiumSeats - this.bookedPremiumSeats;
        }
        public int getTotalGeneralAdmissionSeats() {
            return totalGeneralAdmissionSeats;
        }
        public int getBookedGeneralAdmissionSeats(){
            return bookedGeneralAdmissionSeatsSeats;
        }
        public int getAvailableGeneralAdmissionSeats() {
            return totalGeneralAdmissionSeats - bookedGeneralAdmissionSeatsSeats;
        }

        //constructor, set ivs
        public ConcertTickets(String ArtistName, int totalPremiumSeats, int totalGeneralAdmissionSeats){
            this.ArtistName = ArtistName;
            this.totalFirstPremiumSeats = totalPremiumSeats;
            this.totalGeneralAdmissionSeats = totalGeneralAdmissionSeats;
        }

        //methods
        //returns boolean, accepts two parameters: a boolean called forGeneralAdmission and an int called totalNumberOfSeats.
        //determines if seats are available(true) and how many you can book
        //else returns false
        public boolean reserveSeats(boolean forGeneralAdmission, int totalNumberOfSeats){

            //if FC, check to see if enough seats(TNS less than GAFCS). If so, return true
            if(forGeneralAdmission && totalNumberOfSeats <= getAvailablePremiumSeats()) {
                //add TNS to BFCS and return true
                bookedPremiumSeats += totalNumberOfSeats;
                return true;
            }
            //for coach,  check to see if enough seats(TNS less than GACS), if so return true
            else if(forGeneralAdmission == false && totalNumberOfSeats <= getAvailableGeneralAdmissionSeats()){
                bookedGeneralAdmissionSeats += totalNumberOfSeats;
                return true;
            }
            //no seats available
            else return false;
        }
    }

}
