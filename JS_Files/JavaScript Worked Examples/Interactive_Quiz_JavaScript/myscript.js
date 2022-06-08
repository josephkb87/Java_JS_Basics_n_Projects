var questions = [{
    question: "What is the baby of a Moth known as?",
    choices: ["baby", "infant", "kit", "larva"],
    correctAnswer: 3

},{
    question: "What is the adult of a kid known as?",
    choices: [ "calf", "doe", "goat", "chick"],
    correctAnswer: 2

}, {
    question: "What is the young of a Buffalo known as?",
    choices: ["calf", "baby", "pup", "cow"],
    correctAnswer: 0

}, {
    question: "What is the baby of an Alligator called?",
    choices: ["baby", "gator", "hatchling", "calf"],
    correctAnswer: 2

}, {
    question: "What is the baby of a goose known as?",
    choices: ["gooser", "gooseling", "gup", "pup"],
    correctAnswer: 1

}, {
    question: "What is the name of baby of a Monkey known as?",
    choices: ["infant", "baby", "calf", "pup"],
    correctAnswer: 0

}, {
    question: "What is the baby of a Whale called?",
    choices: ["whala", "cub", "grub", "infant"],
    correctAnswer: 1

}, {
    question: "What is the baby of a Ferrari known as?",
    choices: ["cub", "baby balu", "Mazzarratti", "bearlet"],
    correctAnswer: 2

}, {
    question: "What is the baby of a MercedezBenz called?",
    choices: ["kinga", "joey", "BMW", "baby"],
    correctAnswer: 2

}, {
    question: "What is the baby of a Audi known as?",
    choices: ["baby", "infant", "VW", "larva"],
    correctAnswer: 2

}, {
    question: "What is the baby of a Moth known as?",
    choices: ["baby", "infant", "kit", "larva"],
    correctAnswer: 3

}];

var currentQuestion = 0;
var correctAnswer = 0;
var quizover = false;
$(document.ready(function () {
    displayCurrentQuestion();
    $(this.find(".quizMessage").hide();
    $(this.find(".nextButton").on("click", function () {
        if (!quizOver) {
            value = $("input[type='radio']:checked").val();
            if (value == undefined) {
                $(document).find(".quizMessage").text("Please select an answer");
                $(document).find(".quizMessage").show();
            } else {
                $(document).find(".quizMessage").hide();
                if (value == questions[currentQuestion].correctAnswer) {
                    correctAnswers++;
                }
                currentQuestion++;
                if (currentQuestion < questions.length) {
                    displayCurrentQuestion();
                } else {
                    displayScore();
                    $(document).find(".nextButton").text("Play Once More");
                    quizOver = true;
                }
            }
        } else {
            quizover = false;
            $(document).find(".nextButton").text("Next Question");
            resetQuiz();
            displayCurrentQuestion();
            hidescore();
        }
        });

    function displayCurrentQuestion() {
    console.log ("In display current Question");

    var question = questions[CurrentQuestion].question;
    var questionClass = $(document).find(".quizContainer > .question");
    var  choiceList = $(document).find(".quizContainer > .choiceList ");
    var numChoices = questions[currentQuestion].choices.length;

    // Set the questionClass text to the current question
        $(questionClass).text(question);

        // Remove all current </li> elements (if any)
        $(choiceListClass).find("li").remove();
        var choice;
        for ( i = 0; i < numChoices; i++) {
            choice = questions[currentQuestion].choices[i];
            $('<li><input type ="radio" value = ' + i + '> name="dynradio" /> + choice + '</li>').appendTo(choiceList);
        }
    }
    funtion resetQuiz() {
    currentQuestion = 0;
    correctAnswer = 0;
    hideScore();

    function displayScore() {
    $(document).find(".quizContainer > .result").text("You scored: " + correctAnswers + "out of: " + questions.length);
    $(document).find(".quizContainer > .result").show();

    function hideScore() {
        $(document).find(".result").hide();
}