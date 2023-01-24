package casas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Casa {
    private String direccion;
    private Float metrosCuadrados;

    public Casa(){
        this.direccion = "";
        this.metrosCuadrados = 0.0F;
    }

    //public Casa(String direccion, Float metrosCuadrados){
    //    this.direccion = direccion;
    //    this.metrosCuadrados = metrosCuadrados;
    //}
}
