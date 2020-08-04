adb tcpip 5555;sleep 10;adb connect 192.168.178.57:5555
#adb shell ip addr show rmnet0  | grep 'inet ' | cut -d' ' -f6|cut -d/ -f1 gibt die IP Adresse