const articleInput = document.querySelector(".main_contents input");
const articleTextarea = document.querySelector(".main_contents textarea");
const articleSubmitButton = document.querySelector(".article_WriteButton");


function onSubmit(){
    const title = articleInput.value;
    const content = articleTextarea.value;
    if (title == ""){
        alert("Please write a title");
    } else if (content == ""){
        alert("Please write the contents");
    } else{
        localStorage.setItem("articleTitle", title);
        localStorage.setItem("articleContent", content);
    }
}

articleSubmitButton.addEventListener("click", onSubmit)