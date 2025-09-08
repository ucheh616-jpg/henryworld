//fun joke button
console.log(jokes);
function tellJoke() {
  let jokes = [
    "what is a programmer favorite snack.... microchip",
    "why was the mathbook sad ..... it had too many problem",
    "why did the computer go to school.....beecause it wanted to increase its byte size ",
  ];
  let randomjoke = jokes[Math.floor(Math.random() * jokes.length)];
  document.getElementById("joke").textContent = randomjoke;

  //alert(jokes[0]);//
}
tellJoke();

//let randomNumber = Math.floor(Math.random() * 5);
//console.log(randomNumber)

//music player toggle
function changeSong() {
  document.getElementById("musicselect");
  document.getElementById("audioplayer");
  let select = document.getElementById("musicselect");
  let player = document.getElementById("audioplayer");
  let source = document.getElementById("audiosource");
  //change song based on users selection
  source.src = select.value;
  //reload and play the new song
  player.load();
  player.play();
}

//change theme color
function changeTheme() {
  let color = document.getElementById("colorpicker").value;
  document.getElementById("pages").style.backgroundColor = color;
}

//contact form submission
function sendMessage(event) {
  let person = document.getElementById("names").value;
  let personmessage = document.getElementById("namer").value;
  let contactmessage =
    "Thanks" + person + "your message has been recieved" + personmessage;
  document.getElementById("contactResult").textContent = contactmessage;
  event.preventDefault();
}

//rating function
function rate(emoji) {
  document.getElementById("ratingresult").textContent = "you rated" + emoji;
}
