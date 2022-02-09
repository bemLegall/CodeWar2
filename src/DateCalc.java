import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCalc {
  //yy/mmmm/ddThh:mm:ss.mll
  //2022-02-24T00:00:00.000
	public static long quantosDiasPoEldenRinho(String data) {

		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime diaSagrado = LocalDateTime.parse(data);
		System.out.println(hoje);
		long dias = diaSagrado.until(hoje, ChronoUnit.DAYS);
		long minutos = diaSagrado.until(hoje, ChronoUnit.MINUTES);
		long segundos = diaSagrado.until(hoje, ChronoUnit.SECONDS);
		long horas = diaSagrado.until(hoje, ChronoUnit.HOURS);
	
		System.out.println( "segundos: " + segundos*-1 + " /minutos: " + minutos*-1 +" /horas: "+horas*-1 +" /dias: " + dias*-1);
		
		return dias;
		
	}
}
