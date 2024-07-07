package main

import (
	"encoding/json"
	"io/ioutil"
	"log"
	"net/http"
)

type Users struct {
	Id       string `json:"id"`
	Username string `json:"username"`
	Password string `json:"password"`
}

func fetchUsers() (Users, error) {
	var users Users

	resp, err := http.Get("http://localhost:8080/api/user/create")
	if err != nil {
		return users, err
	}
	defer resp.Body.Close()
	body, err := ioutil.ReadAll(resp.Body)

	err = json.Unmarshal(body, &users)
	return users, err
}

func aggregateHandler(w http.ResponseWriter, r *http.Request) {
	users, err := fetchUsers()
	if err != nil {
		http.Error(w, "Failed to fetch users", http.StatusInternalServerError)
		return
	}

	result := map[string]interface{}{
		"users": users,
	}
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(result)
}
func main() {
	http.HandleFunc("/aggregate", aggregateHandler)

	if err := http.ListenAndServe(":8888", nil); err != nil {
		log.Fatalf("Could not start server: %s\n", err)
	}
}
