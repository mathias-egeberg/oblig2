src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"

function regData(){
    const biletter = {
        film : $("#film").val(),
        antall : $("#antall").val(),
        navn : $("#navn").val(),
        telefon : $("#telefon").val(),
        epost : $("#epost").val()
    };
    $.post("/lagre", biletter, function (){
        hentAlle();
    });
    $("#film").val("");
    $("#antall").val("");
    $("#navn").val("");
    $("#telefon").val("");
    $("#epost").val("");
}

function hentAlle(){
    $.get("/hentAlle", function (data){
        formaterOutput(data);
    });
}

function formaterOutput(bilettene){
    let ut = "<table><tr><th>Film</th><th>Antall</th><th>Navn</th><th>Telefon</th><th>Epost</th></tr>";
    for (const biletter of bilettene){
        ut+="<tr><td>"+biletter.film+"</td><td>"+biletter.antall+"</td><td>"+biletter.navn+"</td><td>"+biletter.telefon+"</td><td>"+biletter.epost+"</td></tr>";
    }
    ut+="</table>";
    $("#output").html(ut);
}