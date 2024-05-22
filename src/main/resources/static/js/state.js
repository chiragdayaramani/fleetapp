$('document').ready(function(){

    $('table #editButton').on('click',function(event){
        event.preventDefault();


        var href=$(this).attr('href');
        $.get(href,function(state,status){
            $('#idEdit').val(state.id);
            $('#ddlCountryEdit').val(state.countryid);
            $('#nameEdit').val(state.name);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
            $('#detailsEdit').val(state.details);

        });

        $('#editModal').modal();
    });

     $('table #editButton').on('click',function(event){
            event.preventDefault();
            var href=$(this).attr('href');

            $.get(href,function(state,status){
                $('#idDetails').val(state.id);
                $('#ddlCountryDetails').val(state.countryid);
                $('#nameDetails').val(state.name);
                $('#capitalDetails').val(state.capital);
                $('#codeDetails').val(state.code);
                $('#detailsDetails').val(state.details);
            });

            $('#detailsModal').modal();

    });

    $('table #deleteButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#deleteModal #delRef').attr('href',href);
        $('#deleteModal').modal();
    });

});