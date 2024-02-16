using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace EklavyaNet.Models
{

    [Table("tutor")]
    public class Tutor
    {
        [Key]
        [Column("tut_id")]
        public int TutId { get; set; }

        [Column("first_name")]
        public string FirstName { get; set; }

        [Column("last_name")]
        public string LastName { get; set; }

        [Column("email")]
        public string Email { get; set; }

        [Column("contact_no")]
        public string ContactNo { get; set; }

        [Column("age")]
        public int Age { get; set; }

        [Column("gender")]
        public string Gender { get; set; }

        [Column("aadhar_no")]
        public string AadharNo { get; set; }

        [Column("country")]
        public string Country { get; set; }

        [Column("state")]
        public string State { get; set; }

        [Column("city")]
        public string City { get; set; }

        [Column("experience")]
        public int Experience { get; set; }

        [Column("about_you")]
        public string AboutYou { get; set; }

        [Column("active")]
        public int Active { get; set; }

        [ForeignKey("sque_id")]
        public SecurityQuestion Sq { get; set; }

        [Column("answer")]
        public string Answer { get; set; }

        [ForeignKey("login_id")]
        public LogIn Login { get; set; }
        public Tutor()
        {
            // Default constructor
        }

        public Tutor(int tutId, string firstName, string lastName, string email, string contactNo, int age,
            string gender, string aadharNo, string country, string state, string city, int experience,
            string aboutYou, int active, SecurityQuestion sq, string answer, LogIn login)
        {
            TutId = tutId;
            FirstName = firstName;
            LastName = lastName;
            Email = email;
            ContactNo = contactNo;
            Age = age;
            Gender = gender;
            AadharNo = aadharNo;
            Country = country;
            State = state;
            City = city;
            Experience = experience;
            AboutYou = aboutYou;
            Active = active;
            Sq = sq;
            Answer = answer;
            Login = login;
        }

        public Tutor(string firstName, string lastName, string email, string contactNo, int age, string gender,
            SecurityQuestion sq, string answer, LogIn login)
        {
            FirstName = firstName;
            LastName = lastName;
            Email = email;
            ContactNo = contactNo;
            Age = age;
            Gender = gender;
            Sq = sq;
            Answer = answer;
            Login = login;
        }

        public override string ToString()
        {
            return "Tutor [TutId=" + TutId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
                   + Email + ", ContactNo=" + ContactNo + ", Age=" + Age + ", Gender=" + Gender + ", AadharNo=" +
                   AadharNo + ", Country=" + Country + ", State=" + State + ", City=" + City + ", Experience=" +
                   Experience + ", AboutYou=" + AboutYou + ", Active=" + Active + ", Sq=" + Sq +
                   ", Answer=" + Answer + ", Login=" + Login + "]";
        }
    }
}
