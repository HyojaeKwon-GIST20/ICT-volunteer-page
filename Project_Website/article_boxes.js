if(localStorage.getItem("articleTitle")){
    const newArticle = document.createElement("h3");
    newArticle.setAttribute("class", "article_title");
    newArticle.innerHTML = localStorage.getItem("articleTitle");
}