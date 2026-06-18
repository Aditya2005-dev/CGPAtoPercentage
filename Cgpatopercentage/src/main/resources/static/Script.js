function send() {

    const obj = {
        cgpa: parseFloat(document.getElementById("cgpa").value)
    };

    fetch("http://localhost:8080/cgpa", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(obj)
    })
    .then(response => response.text())
    .then(data => {

        document.getElementById("result").innerHTML =
            "Percentage = " + data + "%";

    })
    .catch(error => {
        console.log(error);
    });
}