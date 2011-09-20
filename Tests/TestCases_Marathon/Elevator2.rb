#{{{ Marathon
require_fixture 'default'
#}}} Marathon

def test

    $java_recorded_version = "1.6.0_15"

    with_window("(1)") {
        window_closed("(1)")
    }

    with_window("") {
        window_closed("")
    }

end
