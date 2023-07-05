<?php

    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        $userId = $_POST['userId'];
        $username = $_POST['username'];
        $password = $_POST['password'];
        $email = $_POST['email'];
        $phoneNo = $_POST['phoneNo'];

        $password = password_hash($password, PASSWORD_DEFAULT);

        require_once 'DatabaseSe.php';
            $sql = "INSERT INTO userdata(username, password, email, phoneNo) VALUES('$username', '$password', '$email', '$phoneNo')";
                if(mysqli_query($conn, $sql)){
                    $result['success'] = "1";
                    $result['message'] = "success";

                    echo json_encode($result);
                    mysqli_close($conn);
                }
                else{
                    $result['success'] = "0";
                    $result['message'] = "error";

                    echo json_encode($result);
                    mysqli_close($conn);
                }
    }

?>