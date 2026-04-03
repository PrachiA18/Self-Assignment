function fetchScore() {
    var xhr = new XMLHttpRequest();


    var url = "score.json";  

    xhr.open("GET", url, true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            
            var data = JSON.parse(xhr.responseText);

            document.getElementById("match").innerHTML =
                data.match + " (" + data.overs + " Overs)";

            document.getElementById("team1").innerHTML =
                data.team1.name + ": " +
                data.team1.runs + "/" +
                data.team1.wickets;

            document.getElementById("team2").innerHTML =
                data.team2.name + ": " +
                data.team2.runs + "/" +
                data.team2.wickets;
        }
    };

    xhr.send();
}


setInterval(fetchScore, 5000);

fetchScore();