package com.nischita.FlipBucket.APIs;


import com.nischita.FlipBucket.models.MarkSheet;
import com.nischita.FlipBucket.repo.MarkSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkSheetAPI {


    @Autowired
    MarkSheetRepository markSheetRepository;

    @PostMapping("/api/save/student/mark-sheet")
    public ResponseEntity<MarkSheet> saveMarks(
            @RequestParam String studentName,
            @RequestParam Integer year,
            @RequestParam Integer mathMarks,
            @RequestParam Integer physicsMarks,
            @RequestParam Integer chemistryMarks

    ){

        MarkSheet markSheet = new MarkSheet();
        markSheet.setStudentName(studentName);
        markSheet.setYear(year);
        markSheet.setChemistryMarks(chemistryMarks);
        markSheet.setMathMarks(mathMarks);
        markSheet.setPhysicsMarks(physicsMarks);



        if(mathMarks < 35 || physicsMarks <35 || chemistryMarks <35){
            markSheet.setPassed(false);
        }else{
            markSheet.setPassed(true);
        }


        try{
            markSheetRepository.save(markSheet);
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println(markSheet);


        return new ResponseEntity<>(markSheet, HttpStatus.OK);

    }



}
