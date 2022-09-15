const app = angular.module("myApp", []);

app.controller("myCtrl", function ($scope, $http) {
    $scope.nv = [];
    $scope.form = {};
    $scope.pb = [];
    $scope.cb = [];
    $scope.initialize = function () {

        $http.get("/rest/nhan-viens").then(Response => {
            $scope.nv = Response.data;
            // $scope.nv.forEach(nv =>{
            //     items.ngaySinh = new Date(nv.ngaySinh);
            // });
            // $scope.nv.forEach(nv =>{
            //     items.ngayVL = new Date(nv.ngayVL);
            // })
        });
        $http.get("/rest/phong-bans").then(Response => {
            $scope.pb = Response.data;

        });
        $http.get("/rest/cap-bacs").then(Response => {
            $scope.cb = Response.data;

        });
    }
  
    $scope.edit = function (item) {
        $scope.form = angular.copy(item);
    }
   
    $scope.create = function(){
        var item = angular.copy($scope.form);
        $http.post(`/rest/nhan-viens`,item).then(Response =>{
            $scope.nv.push(Response.data);
            alert("Thêm mới thành công");
            $scope.initialize();
        }).catch(error =>{
            alert("Lỗi thêm mới");
            console.log("Error",error);
        });
    }
    $scope.update = function(){
        var item = angular.copy($scope.form);
        $http.put(`/rest/nhan-viens/${item.id}`,item).then(Response =>{
            var index =$scope.nv.findIndex(p => p.id == item.id);
            $scope.nv[index] = item;
            alert("Cập nhật thành công");
        }).catch(erro =>{
            alert("Lỗi cập nhật");
            console.log("Error",erro);
        });
    }

    $scope.delete = function(item){
        $http.delete(`/rest/nhan-viens/${item.id}`).then(Response =>{
            var index =$scope.nv.findIndex(p => p.id == item.id);
            $scope.nv.splice(index,1);
            alert("Xóa thành công");
        }).catch(erro =>{
            alert("Lỗi xóa ");
            console.log("Error",erro);
        });
    }


    $scope.initialize();
})
