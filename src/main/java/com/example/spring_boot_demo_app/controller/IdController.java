package com.example.spring_boot_demo_app.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/ids")
public class IdController {

    List<Integer> idList = new ArrayList<>();

    //Get ids
    @GetMapping
    public ResponseEntity<List<Integer>> getIds() {
        return ResponseEntity.ok(idList);
    }

    @GetMapping("/sort")
    public ResponseEntity<List<Integer>> getSortedIds() {
        Collections.sort(idList);
        return ResponseEntity.ok(idList);
    }

    // Add ids
    @PostMapping("/add")
    public ResponseEntity<List<Integer>> addIds(@RequestBody List<Integer> ids) {
        System.out.println("Request ids to add:" + ids);
        idList.addAll(ids);
        return ResponseEntity.ok(idList);
    }

    // ✅ PUT - Update ID (replace oldId with newId)
    @PutMapping("/update")
    public ResponseEntity<?> updateId(@RequestParam Integer oldId, @RequestParam Integer newId) {
        int index = idList.indexOf(oldId);
        System.out.println("Index ids to update:" + index);

        if (index == -1) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found: " + oldId);
        }
        idList.set(index, newId);
        return ResponseEntity.ok(idList);
    }

    // ✅ DELETE - Remove one ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteId(@PathVariable Integer id) {
        boolean removed = idList.remove(id);
        if (!removed) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found: " + id);
        }
        return ResponseEntity.ok(idList);
    }

    // ✅ DELETE ALL - Clear all IDs
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllIds() {
        idList.clear();
        return ResponseEntity.ok("All IDs deleted");
    }

}