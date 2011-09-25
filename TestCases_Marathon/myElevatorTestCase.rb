#{{{ Marathon
require_fixture 'default'
#}}} Marathon

def test

     $java_recorded_version = "1.6.0_15"

    with_window("") {
        select("Number of Floors", "5")
        select("Number of Floors", "6")
        select("Number of Cars", "3")
        
        with_window("Select User Panel type") {
            select("Car 1", "Even")
            select("JComboBox_9", "Odd")
            click("Apply")
        }
        select("User Panel Color", "Green")
        select("User Panel Pressed Button Color", "Blue")
        select("Floor Panel Color", "Green")
        select("Floor Panel Pressed Button Color", "Blue")

        
        click("Show ELevator")

        with_window("Elevator Simulation System") {
        click("UpButton")  # clicking floor 5 
        assert_p("UpButton", "Background", "[r=0,g=0,b=255]")
        sleep(20);
        assert_p("UpButton", "Background", "[r=0,g=255,b=0]")
        sleep(10);
        assert_p("JTextField_102", "Text", "IDLE")      
    }
}
end
