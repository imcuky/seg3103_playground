// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;
// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// /**
//  * FullConverage
//  */
// class FullConverageTest {

//     // Constructor and Getters Tests
//     @Test
//     public void testConstructorAndGetters() {
//         Date date = new Date(2024, 2, 29);
//         assertEquals(2024, date.getYear());
//         assertEquals(2, date.getMonth());
//         assertEquals(29, date.getDay());
        
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 2, 29)); // Invalid non-leap year date
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 13, 1)); // Invalid month
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 0, 10)); // Invalid month
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 6, 0));  // Invalid day
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 4, 31)); // Invalid day in April
//     }

//     // Leap Year Tests
//     @Test
//     public void testIsLeapYear() {
//         Date date1 = new Date(2000, 1, 1);
//         assertTrue(date1.isLeapYear());  // Year % 400 == 0

//         Date date2 = new Date(1900, 1, 1);
//         assertFalse(date2.isLeapYear());  // Year % 100 == 0 && Year % 400 != 0

//         Date date3 = new Date(2004, 1, 1);
//         assertTrue(date3.isLeapYear());  // Year % 4 == 0 && Year % 100 != 0

//         Date date4 = new Date(2001, 1, 1);
//         assertFalse(date4.isLeapYear());  // Year % 4 != 0
//     }

//     // Month Validation Tests
//     @Test
//     public void testSetMonth() {
//         Date date = new Date(2023, 5, 15);
//         assertEquals(5, date.getMonth());
        
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 13, 1)); // Invalid month
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 0, 1));  // Invalid month
//     }

//     // Day Validation Tests
//     @Test
//     public void testSetDay() {
//         Date leapDate = new Date(2024, 2, 29); // Valid leap year date
//         assertEquals(29, leapDate.getDay());

//         Date nonLeapDate = new Date(2023, 2, 28); // Valid non-leap year date
//         assertEquals(28, nonLeapDate.getDay());
        
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 2, 29)); // Invalid day in non-leap year
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 6, 0));  // Invalid day < 1
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 6, 32)); // Invalid day > 31
//         assertThrows(IllegalArgumentException.class, () -> new Date(-1, 6, 32)); // Invalid year < 0

//         // isThirtyDayMonth()
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 4, 31)); // Invalid day in April
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 6, 31)); // 
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 9, 31)); //
//         assertThrows(IllegalArgumentException.class, () -> new Date(2023, 11, 31)); //

//         //isLeapYear()
//         assertThrows(IllegalArgumentException.class, () -> new Date(2000, 2, 30));
        
//     }
//     @Test
//     public void testEndOfMonth(){
        
//         //day == 31
//         assertEquals(new Date(2024, 1, 31).nextDate(), new Date(2024, 2, 1));// T
//         assertEquals(new Date(2024, 1, 30).nextDate(), new Date(2024, 1, 31));// F
        


//         //(day == 30 && isThirtyDayMonth())
//         assertEquals(new Date(2023, 4, 30).nextDate(), new Date(2023, 5, 1)); // T; T
        
//         assertEquals(new Date(2023, 1, 30).nextDate(), new Date(2023, 1, 31)); // T; F
//         assertEquals(new Date(2023, 4, 17).nextDate(), new Date(2023, 4, 18)); // F; T
        
        
//         // (this.month == 2 && ((day == 29 && leap) || (day == 28 && !leap)))
        
//         assertEquals(new Date(2023, 2, 27).nextDate(), new Date(2023, 2, 28)); //*  T; ((day == 29 && leap)=F || (day == 28 && !leap)=F)

//         assertEquals(new Date(2024, 2, 29).nextDate(), new Date(2024, 3, 1)); //* T; ((day == 29 && leap)=T || (day == 28 && !leap)=F)

       

//         assertEquals(new Date(2023, 2, 28).nextDate(), new Date(2023, 3, 1)); //*  T; ((day == 29 && leap)=F || (day == 28 && !leap)=T)

//         assertEquals(new Date(2024, 2, 28).nextDate(), new Date(2024, 2, 29)); //*  T; (day == 28 && !leap) = F


        

        
        
        

        


       
        



//     }

//     // Next Date Tests
//     @Test
//     public void testNextDate() {
//         Date date = new Date(2023, 5, 15);
//         Date nextDate = date.nextDate();
//         assertEquals(2023, nextDate.getYear());
//         assertEquals(5, nextDate.getMonth());
//         assertEquals(16, nextDate.getDay());

//         Date endOfMonthDate = new Date(2023, 1, 31);
//         Date nextMonthDate = endOfMonthDate.nextDate();
//         assertEquals(2023, nextMonthDate.getYear());
//         assertEquals(2, nextMonthDate.getMonth());
//         assertEquals(1, nextMonthDate.getDay());

//         Date endOfYearDate = new Date(2023, 12, 31);
//         Date nextYearDate = endOfYearDate.nextDate();
//         assertEquals(2024, nextYearDate.getYear());
//         assertEquals(1, nextYearDate.getMonth());
//         assertEquals(1, nextYearDate.getDay());
//     }

//     // End of Month Tests
//     @Test
//     public void testToString() {
//         Date date1 = new Date(2023, 1, 31);
//         assertEquals("2023/January/31", date1.toString());

        
//     }

   
//     // Equals Method Tests
//     @Test
//     public void testEquals() {
//         Date date1 = new Date(2023, 5, 15);
//         Date date2 = new Date(2023, 5, 15);
//         Date date3 = new Date(2024, 5, 15);

//         assertTrue(date1.equals(date2));  // Equal dates
        
//         assertFalse(date1.equals(date3)); // Non-equal dates, year
//         assertFalse(date1.equals(new Date(2023, 6, 15))); // Non-equal dates, month
//         assertFalse(date1.equals(new Date(2023, 5, 16))); // Non-equal dates, day

//         assertFalse(date1.equals(new Object())); // Comparison with non-Date object
//     }
// }