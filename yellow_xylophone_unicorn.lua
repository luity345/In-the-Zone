-- FILE: InTheZone.lua

-- Initialize Game Variables
width = 800
height = 600
points = 0
lives = 3
time = 0

-- Load Assets
backgroundImage = love.graphics.newImage('background.png')
playerImage = love.graphics.newImage('player.png')
obstacleImage = love.graphics.newImage('obstacle.png')

-- Load fonts
font1 = love.graphics.newFont('font1.ttf', 18)
font2 = love.graphics.newFont('font2.ttf', 24)

-- Initialize Game Objects 
player = {x = width/2, y = height/2}
obstacles = { {x = 100, y = 200}, {x = 400, y = 600}, {x = 600, y = 500} }

-- Update the Game State
function update() 
    if time > 10 then
        gameOver()
    else 
        time = time + 1     
    end
    playerMovement()
    collisionCheck() 
end

-- Handle User Input
function playerMovement() 
    if love.keyboard.isDown('left') then
        player.x = player.x - 5
    elseif love.keyboard.isDown('right') then
        player.x = player.x + 5
    elseif love.keyboard.isDown('up') then
        player.y = player.y - 5
    elseif love.keyboard.isDown('down') then
        player.y = player.y + 5
    end
end

-- Check for Collisions
function collisionCheck() 
    for i,obstacle in ipairs(obstacles) do
        if CheckCollision(player.x, player.y, playerImage:getWidth(), playerImage:getHeight(), obstacle.x, obstacle.y, obstacleImage:getWidth(), obstacleImage:getHeight()) then
            table.remove(obstacles, i)
            points = points + 1
        end 
    end
end

-- Check for Collision between two objects
function CheckCollision(x1,y1,w1,h1, x2,y2,w2,h2)
  return x1 < x2+w2 and
         x2 < x1+w1 and
         y1 < y2+h2 and
         y2 < y1+h1
end

-- Game Over Function
function gameOver() 
    love.event.quit()
end

-- Render the Game State
function draw() 
    --Draw the background
    love.graphics.draw(backgroundImage, 0, 0)
    --Draw the player
    love.graphics.draw(playerImage, player.x, player.y)
    --Draw the obstacles
    for i,obstacle in ipairs(obstacles) do
        love.graphics.draw(obstacleImage, obstacle.x, obstacle.y)
    end
    --Draw the points
    love.graphics.setFont(font1)
    love.graphics.printf('Points: ' .. points, 0, 0, width, 'left')
    --Draw the lives
    love.graphics.setFont(font2)
    love.graphics.printf('Lives: ' .. lives, 0, height-font2:getHeight(), width, 'right')
end

-- LOVE2D Update and Draw calls 
function love.update(dt)
    update()
end

function love.draw()
    draw()
end