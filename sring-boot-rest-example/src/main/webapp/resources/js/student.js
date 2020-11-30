

$(document).ready(function () {
    $.ajax({
        url: "http://localhost:8888/student/1",
        success: function (data) {
            $("#rollNo").append(data.rollNo);
            $("#name").append(data.name);

        },
        error: function (xhr, ajaxOptions, thrownError) {
            alert(xhr.responseText + "\n" + xhr.status + "\n" + thrownError);
        }
    });

});
