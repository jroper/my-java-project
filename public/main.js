function loadFoo(id) {
  $.ajax("/foo/" + id, {
    success: function(data) {
      $("#foo").append($("<div>").style({
        "font-weight": "bold",
        "color": "red"
      }).text(data.name);
    }
  });
}
