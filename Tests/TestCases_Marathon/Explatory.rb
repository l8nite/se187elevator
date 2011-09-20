#{{{ Marathon
require_fixture 'default'
#}}} Marathon

def test

    $java_recorded_version = "1.6.0_15"

    with_window("") {
        select("Number of Floors", "4")
        select("Number of Cars", "2")

        with_window("Select User Panel type") {
            select("JComboBox_12", "Even")
            click("Apply")
        }

        click("Show ELevator")

        with_window("Elevator Simulation System") {
            window_closed("Elevator Simulation System")
        }

        
    }

end
