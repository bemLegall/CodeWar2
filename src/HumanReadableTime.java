/*Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)*/
public class HumanReadableTime {

	public String makeReadable(int seconds) {

		if(seconds == 0) {
			 return "00:00:00";
		 }
		 
		 Integer minutos =00;
		 Integer horas = 00;
		 
		 while(seconds >= 60) {
			 minutos +=1;
			 seconds-=60;
			 	while(minutos >= 60) {
			 		horas+=1;
			 			minutos-=60;
			 }		 
		 }
		if (seconds < 10 && minutos < 10 && horas < 10) {
			String res = "0" + horas + ":0" + minutos + ":0" + seconds;
			return res;
		}
		if (seconds < 10 && minutos < 10) {
			return horas + ":0" + minutos + ":0" + seconds;
		}
		if (horas < 10 && minutos < 10 && seconds >=10) {
			return "0" + horas + ":0" + minutos + ":" + seconds;
		}
		if (horas < 10 && seconds < 10 && minutos >= 10) {
			return "0" + horas + ":" + minutos + ":0" + seconds;
		}
		if(horas < 10 && minutos >= 10 && seconds >= 10) {
			return "0" + horas + ":"+ minutos + ":"+ seconds;
		}
		if (seconds < 10 && horas >= 10 && minutos >= 10) {
			return horas + ":" + minutos + ":0" + seconds;
		}
		if(minutos < 10 && horas >= 10 && seconds >= 10) {
			return horas + ":0" + minutos +":"+ seconds;
		}
		return  horas + ":" + minutos + ":" + seconds;

	}
 }