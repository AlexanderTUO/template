$(function () {
    // alert("欢迎来到模板！");
    var $select = $(".selectEx");
    $(".selectEx").multipleSelect({
        selectAll: true,
        filter: true,
        selectAllText: '所有角色',
        allSelected: '所有角色',
        formatSelectAll () {
            return '[全选]'
        },
        formatAllSelected () {
            return '已选择所有记录'
        },
        formatCountSelected (count, total) {
            return '已从 ' + total + ' 中选择 ' + count + ' 条记录'
        },
        formatNoMatchesFound () {
            return '没有找到记录'
        }
    });

    $('#setSelectsBtn').click(function () {
        $select.multipleSelect('setSelects', [1, 3])
    })

    $('#getSelectsBtn').click(function () {
        alert('Selected values: ' + $select.multipleSelect('getSelects'))
        alert('Selected texts: ' + $select.multipleSelect('getSelects', 'text'))
    })
});