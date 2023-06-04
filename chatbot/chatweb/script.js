function sendMessage() {
    var userInput = document.getElementById("chat-input").value;
    var userMessage = document.createElement("div");
    userMessage.className = "message user-message";
    userMessage.textContent = userInput;
    document.getElementById("user-message").appendChild(userMessage);
    document.getElementById("chat-input").value = "";

    // Simulación de respuesta del bot
    setTimeout(function() {
        var botMessage = document.createElement("div");
        botMessage.className = "message bot-message";
        botMessage.textContent = generateBotResponse(userInput);
        document.getElementById("user-message").appendChild(botMessage);
    }, 1000);
}

function generateBotResponse(userInput) {
        //aqui se agrega datos de respuesta con la siguiente sintaxis: "pregunta":"respuesta"
    var keywordResponses = {
        "menu": "Preguntas que puede realizar:\n1) INTERNACIONALÍZATE\n2) CONOCE TU NUEVO PORTAL ESTUDIANTIL\n3) EXPERIENCIA ACADÉMICA\n4) VIDA UNIVERSITARIA\n5) SEGURIDAD E HIGIENE\n6) INTERACCIÓN Y APOYO ESTUDIANTIL",
        "hola": "¡Hola! Soy un bot de preguntas frecuentes realizadas. Pregúntame cualquier cosa relacionada con la universidad escribiendo menu y trataré de ayudarte.",
        "adios": "¡Hasta luego!",
        "INTERNACIONALIZATE": "Realize una de las siguientes preguntas\n¿Cuándo inicia el periodo de Postulación de Internacionalízate?\nLlegando a mi Intercambio, ¿tendré que estar 10 días en aislamiento?\n ¿Para irme de Intercambio dentro del Programa Internacionalízate se requiere estar vacunado?",
        "¿Cuándo inicia el periodo de Postulación de Internacionalízate?": "Mantente informado a través del siguiente link: https://rrii.unifranz.edu.bo/ ",
        "Llegando a mi Intercambio, ¿tendré que estar 10 días en aislamiento?": "Todo depende de la normativa de las autoridades de salud del país de destino.Se recomienda estar en constante comunicación con el Coordinador de Movilidad Internacional de tu sede",
        "¿Para irme de Intercambio dentro del Programa Internacionalízate se requiere estar vacunado?": "Las indicaciones sobre cómo realizar tu viaje a tu destino las establece cada país y la universidad anfitriona. La mayoría de los países exigen una prueba PCR antes de viajar y hay algunos que establecen requisitos adicionales.Es necesario consultar continuamente las páginas oficiales de la aerolínea, la embajada del país de tu destino y la universidad anfitriona.",
    };

    // Verificar si alguna palabra clave está contenida en el userInput
    for (var keyword in keywordResponses) {
        if (userInput.toLowerCase().includes(keyword)) {
            return keywordResponses[keyword];
        }
    }

    return "Lo siento, no puedo responder a eso en este momento.";
}